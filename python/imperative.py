import random




def create_members():
    names = ['jack', 'joe', 'jason', 'james', 'john', 'jakob', 'june', 'jeb', 'jarrod', 'jim']
    coding_languages = ['scala', 'python', 'java', 'java script', 'go', 'haskell']
    beverages = ['beer', 'bubbly', 'schnaps', 'jaegerbombs', 'milk']
    members = []
    for i in range(0, len(names) - 1):
        members.append({
            'name': names[i],
            'likes_tacos': names[i].startswith('ja'),
            'coding_language': coding_languages[random.randint(0, len(coding_languages) - 1)],
            'favorite_beverage': beverages[random.randint(0, len(beverages) - 1)],
            'age': random.randint(18, 65)
        })
    return members


def find_taco_lovers(members):
    taco_lovers = []
    for member in members:
        if member['likes_tacos']:
            taco_lovers.append(member)
    return taco_lovers


def count_beer_drinkers(members):
    beer_drinkers = []
    for item in members:
        if item['favorite_beverage'] == 'beer':
            beer_drinkers.append(item)
    return len(beer_drinkers)


def average_age(members):
    age = 0
    for item in members:
        age = age + item['age']
    return float(age / len(members))


def programming_lang_counts(members, languages):
    langs = dict.fromkeys(languages, 0)
    for item in members:
        langs[item['coding_language']] = langs[item['coding_language']] + 1
    return langs


if __name__ == '__main__':
    items = create_members()
    for member in find_taco_lovers(find_taco_lovers(items)):
        print('{} likes tacos'.format(member['name']))

    print('{} members like beer'.format(count_beer_drinkers(items)))

    print('The average age is {}'.format(average_age(items)))

    coding_languages = []
    for i in items:
        coding_languages.append(i['coding_language'])
    stats = programming_lang_counts(items, list(set(coding_languages)))
    for stat in dict.keys(stats):
        print('{} people code {}'.format(stats[stat], stat))
