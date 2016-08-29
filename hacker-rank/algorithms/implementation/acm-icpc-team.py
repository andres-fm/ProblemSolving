n, m = map(int, input().split())
max_topics = 0
max_teams = 0
# stores the inputs as integers from a binary representation (i.e 101 is stored as 5)
persons = [int(input(), 2) for _ in range(n)]
for i in range(n) :
    for j in range(i+1, n) :
        # sets the binary number from the 'or' operation
        team_problems = format(persons[i]|persons[j], 'b')
        # counts how many topics the team can do
        topics = team_problems.count('1')
        # resets the values of max_topics and max_teams if a bigger number of topics is found
        if topics > max_topics :
            max_topics = topics
            max_teams = 1
        # counter for teams that can do the current max_topics number of topics
        elif topics == max_topics :
            max_teams += 1
print(max_topics)
print(max_teams)
