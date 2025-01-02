
def determine_winner(player1_choice, player2_choice):
    if player1_choice == player2_choice:
        return "It's a tie!"
    
    if (player1_choice == 'rock' and player2_choice == 'scissors') or \
       (player1_choice == 'scissors' and player2_choice == 'paper') or \
       (player1_choice == 'paper' and player2_choice == 'rock'):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"


def play_game():
    while True:  
        
        player1_choice = input("Player 1, enter your choice (rock, paper, or scissors): ").lower()
        while player1_choice not in ['rock', 'paper', 'scissors']:
            print("Invalid choice! Please choose rock, paper, or scissors.")
            player1_choice = input("Player 1, enter your choice (rock, paper, or scissors): ").lower()

        
        player2_choice = input("Player 2, enter your choice (rock, paper, or scissors): ").lower()
        while player2_choice not in ['rock', 'paper', 'scissors']:
            print("Invalid choice! Please choose rock, paper, or scissors.")
            player2_choice = input("Player 2, enter your choice (rock, paper, or scissors): ").lower()

        
        result = determine_winner(player1_choice, player2_choice)
        print(result)

        
        play_again = input("Do you want to play another round? (Yes/No): ").lower()
        if play_again != 'yes':
            print("Thanks for playing!")
            break  


play_game()
