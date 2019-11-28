package id.haadii.submission.dicoding.architecturecomponent.utils

import id.haadii.submission.dicoding.architecturecomponent.R
import id.haadii.submission.dicoding.architecturecomponent.movie.Movie
import id.haadii.submission.dicoding.architecturecomponent.tvShow.TvShow

class FakeDataDummy {
    fun getMovie() : ArrayList<Movie> {
        val moviesList = ArrayList<Movie>()

        moviesList.add(
            Movie("John Wick: Chapter 3 – Parabellum",
                release = "May 9, 2019",
                overview = "Super-assassin John Wick returns with a \$14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn",
                genre = "Crime, Thriller",
                runtime = "2h 11m",
                photo = R.drawable.john_wick_3)
        )
        moviesList.add(
            Movie("The Lion King",
                release = "July 19, 2019",
                overview = "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub\\'s arrival. Scar, Mufasa\\'s brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba\\'s exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.",
                genre = "Adventure, Animation, Family, Drama, Action",
                runtime = "1h 58m",
                photo = R.drawable.lion_king)
        )
        moviesList.add(
            Movie("Angel Has Fallen",
                release = "August 23, 2019",
                overview = "Secret Service Agent Mike Banning is framed for the attempted assassination of the President and must evade his own agency and the FBI as he tries to uncover the real threat.",
                genre = "Action",
                runtime = "2h 1m",
                photo = R.drawable.angel_has_fallen)
        )
        moviesList.add(
            Movie("Aladdin",
                release = "May 24, 2019",
                overview = "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
                genre = "Adventure, Fantasy, Romance, Comedy, Family",
                runtime = "2h 8m",
                photo = R.drawable.aladdin)
        )
        moviesList.add(
            Movie("Spider-Man: Far from Home",
                release = "June 26, 2019",
                overview = "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
                genre = "Action, Adventure, Science Fiction",
                runtime = "2h 9m",
                photo = R.drawable.far_from_home)
        )
        moviesList.add(
            Movie("Avengers: Endgame",
                release = "April 22, 2019",
                overview = "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos\\' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                genre = "Action, Adventure, Science Fiction",
                runtime = "3h 1m",
                photo = R.drawable.end_game)
        )
        moviesList.add(
            Movie("Men in Black: International",
                release = "June 11, 2019",
                overview = "The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.",
                genre = "Action, Adventure, Science Fiction, Comedy",
                runtime = "1h 55m",
                photo = R.drawable.mib)
        )
        moviesList.add(
            Movie("Godzilla: King of the Monsters",
                release = "May 31, 2019",
                overview = "Follows the heroic efforts of the crypto-zoological agency Monarch as its members face off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed King Ghidorah. When these ancient super-species - thought to be mere myths - rise again, they all vie for supremacy, leaving humanity\\'s very existence hanging in the balance.",
                genre = "Action, Science Fiction",
                runtime = "2h 12m",
                photo = R.drawable.godzilla)
        )
        moviesList.add(
            Movie("Shazam!",
                release = "March 23, 2019",
                overview = "A boy is given the ability to become an adult superhero in times of need with a single magic word.",
                genre = "Action, Fantasy Comedy",
                runtime = "2h 12m",
                photo = R.drawable.shazam)
        )
        moviesList.add(
            Movie("Pokémon Detective Pikachu",
                release = "May 10, 2019",
                overview = "In a world where people collect pocket-size monsters (Pokémon) to do battle, a boy comes across an intelligent monster who seeks to be a detective.",
                genre = "Action, Adventure, Fantasy",
                runtime = "1h 45m",
                photo = R.drawable.pikachu)
        )

        return moviesList
    }

    fun getTvShow() : ArrayList<TvShow> {
        val tvShowList = ArrayList<TvShow>()

        tvShowList.add(
            TvShow("Arrow",
                release = "October 10, 2012",
                overview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                genre = "Crime, Drama, Mystery, Action and Adventure",
                runtime = "42m",
                photo = R.drawable.arrow)
        )
        tvShowList.add(
            TvShow("Family Guy",
                release = "January 31, 1999",
                overview = "Sick, twisted, politically incorrect and Freakin\\' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he\\'s not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                genre = "Animation, Comedy",
                runtime = "22m",
                photo = R.drawable.familyguy)
        )
        tvShowList.add(
            TvShow("Game of Thrones",
                release = "April 17, 2011",
                overview = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night\\'s Watch, is all that stands between the realms of men and icy horrors beyond.",
                genre = "Sci-Fi and Fantasy, Drama, Action and Adventure",
                runtime = "60m",
                photo = R.drawable.got)
        )
        tvShowList.add(
            TvShow("Gotham",
                release = "September 22, 2014",
                overview = "Before there was Batman, there was GOTHAM.\\nEveryone knows the name Commissioner Gordon. He is one of the crime world\\'s greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon\\'s story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world\\'s most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                genre = "Drama, Fantasy, Crime",
                runtime = "43m, 60m",
                photo = R.drawable.gotham)
        )
        tvShowList.add(
            TvShow("Rick and Morty",
                release = "December 2, 2013",
                overview = "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty\\'s already unstable family life, these events cause Morty much distress at home and school.",
                genre = "Sci-Fi and Fantasy, Action and AdventureAnimation, Comedy",
                runtime = "22m",
                photo = R.drawable.rickandmorty)
        )
        tvShowList.add(
            TvShow("The Seven Deadly Sins",
                release = "October 5, 2014",
                overview = "The \\“Seven Deadly Sins\\”—a group of evil knights who conspired to overthrow the kingdom of Britannia—were said to have been eradicated by the Holy Knights, although some claim that they still live. Ten years later, the Holy Knights have staged a Coup d\\'état and assassinated the king, becoming the new, tyrannical rulers of the kingdom. Elizabeth, the king\\'s only daughter, sets out on a journey to find the “Seven Deadly Sins,” and to enlist their help in taking back the kingdom.",
                genre = "Action and Adventure, Animation, Sci-Fi and Fantasy",
                runtime = "24m",
                photo = R.drawable.sevendeadlysins)
        )
        tvShowList.add(
            TvShow("Marvel\\'s Agents of S.H.I.E.L.D.",
                release = "September 24, 2013",
                overview = "Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.",
                genre = "Sci-Fi and Fantasy, Drama, Action and Adventure",
                runtime = "43m",
                photo = R.drawable.shield)
        )
        tvShowList.add(
            TvShow("South Park",
                overview = "Follows the misadventures of four irreverent grade-schoolers in the quiet, dysfunctional town of South Park, Colorado.",
                release = "August 13, 1997",
                genre = "Comedy, Animation",
                runtime = "22m",
                photo = R.drawable.soutpark)
        )
        tvShowList.add(
            TvShow("Supernatural",
                release = "September 13, 2005",
                overview = "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America … and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their \\'67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                genre = "Drama, Mystery, Sci-Fi and Fantasy",
                runtime = "45m",
                photo = R.drawable.supernatural)
        )
        tvShowList.add(
            TvShow("The Simpsons",
                release = "December 17, 1989",
                overview = "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                genre = "Animation, Comedy",
                runtime = "22m",
                photo = R.drawable.the_simpsons)
        )

        return tvShowList
    }
}