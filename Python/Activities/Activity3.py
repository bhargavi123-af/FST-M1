def determine_winner(player1_choice, player2_choice):
    if player1_choice == player2_choice:
        return "It's a tie!"
    
    if (player1_choice == 'rock' and player2_choice == 'scissors') or \
       (player1_choice == 'scissors' and player2_choice == 'paper') or \
       (player1_choice == 'paper' and player2_choice == 'rock'):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"

# Main game function
def play_game():
    # Prompt player 1 for their choice
    player1_choice = input("Player 1, enter your choice (rock, paper, or scissors): ").lower()
    while player1_choice not in ['rock', 'paper', 'scissors']:
        print("Invalid choice! Please choose rock, paper, or scissors.")
        player1_choice = input("Player 1, enter your choice (rock, paper, or scissors): ").lower()

    # Prompt player 2 for their choice
    player2_choice = input("Player 2, enter your choice (rock, paper, or scissors): ").lower()
    while player2_choice not in ['rock', 'paper', 'scissors']:
        print("Invalid choice! Please choose rock, paper, or scissors.")
        player2_choice = input("Player 2, enter your choice (rock, paper, or scissors): ").lower()

    # Determine and print the winner
    result = determine_winner(player1_choice, player2_choice)
    print(result)

play_game()