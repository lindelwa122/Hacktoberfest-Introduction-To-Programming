# import the needed libreries;
from string import ascii_letters
from time import sleep
import os

# define the main function, in with all algorithm will run
def main():
    # make a list with the accepted extensions;
    extlist = ['html', 'css', 'js', 'py', 'c', 'csv', 'txt']

    # declare a variable that set the acceptables characters (letters, numbers and a dot);
    acpt = ascii_letters + '.0123456789'

    # create the main directory;
    if os.path.isdir('main') == False:
        os.mkdir('./main')

    # create the list that will store the files created
    files_list = []
    # create the default messages explaining the constraints
    msg01 = 'Enter a file name, followed by a dot and one of the extensions that will be shown to you.'
    msg02 = 'With the dot and extension apart, the file name must have 12 characteres the most, without spaces and any other signals except by the dot, numbers are allowed.'
    msg03 = 'The valid extensions are: '

    # run the loop until the file name is correct;
    while True:
        # print constraints and the extensions acceptables
        print(msg01 + '\n' + msg02 + '\n' + msg03 + '\n' + ', '.join(extlist))
        # create a variable to store the user input
        asw01 = input('Type the file name followed by the dot and its extension: ')
        # check the dot existence
        if '.' not in asw01:
            print('You must put a dot between the name and the extension')
            continue
        # create a list with the splited input
        name = asw01.split(".", maxsplit=2)
        # check the name lenght
        if len(name[0]) < 1 or len(name[0]) > 12:
            print('The file name must have between 1 and 12 characters')
            continue
        # create a variable to store the extension
        ext = name[1]
        # check the characters and the extension
        if all(c in acpt for c in asw01) and ext in extlist:
            # check if the extension folder exist, if not, create it and store the file in it
            if os.path.exists('main/' + ext) == False:
                os.mkdir('./main/'+ ext)
                file = open('./main/' + ext + '/' + asw01, 'a')
                file.close()
                keep_creating(asw01, files_list)
            # check if the file exist in its related folder, if not, store the file in it
            elif os.path.exists('./main/'+ ext +'/' + asw01) == False:
                file = open('./main/' + ext + '/' + asw01, 'a')
                file.close()
                keep_creating(asw01, files_list)
            else:
                print("This directory already has a file with this name")
        else:
            print("Digit a valid file name (only letters, numbers and a dot followed by the name) whith the valid extensions: ", extlist)




def keep_creating(answer, list):
    print('File created with success, do you want to create another one?')
    list.append(answer)

    while True:
        asw02 = input('Press [y] or [n]: ').lower()
        if asw02 == 'y':
            return
        elif asw02 == 'n':
            print('This program will be closed, the files created are: ', ', '.join(list))
            sleep(5)
            exit()
        else:
            print('type a valid letter')


main()
