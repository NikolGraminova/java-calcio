package org.java.lessons.football;

/*
Creare infine una classe Main e definire al suo interno un array di nomi e un array con i possibili ruoli per i giocatori.
Nel metodo main, generare una Squadra formata da 11 giocatori creati in modo randomico:
prelevare un nome casuale dall’array di nomi
generare l’età in modo casuale
prelevare un ruolo casuale dall’array di possibili ruoli
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // ChatGPT generated lists of players, positions and managers
        String[] names = {
                "Cristiano Ronaldo", "Lionel Messi", "Neymar Jr.", "Kylian Mbappé", "Sergio Ramos",
                "Kevin De Bruyne", "Virgil van Dijk", "Mohamed Salah", "Robert Lewandowski", "Harry Kane",
                "Luka Modrić", "Toni Kroos", "Paulo Dybala", "N'Golo Kanté", "Manuel Neuer",
                "Antoine Griezmann", "Eden Hazard", "Alisson Becker", "Marco Reus", "Raheem Sterling",
                "Karim Benzema", "Gareth Bale", "Sadio Mané", "Jan Oblak", "Pierre-Emerick Aubameyang",
                "Luis Suárez", "Thomas Müller", "Edinson Cavani", "David de Gea", "Son Heung-min",
                "Jadon Sancho", "Romelu Lukaku", "Paul Pogba", "Sergio Agüero", "Thiago Alcântara",
                "Serge Gnabry", "Aymeric Laporte", "Casemiro", "Vinícius Júnior", "Dani Carvajal",
                "Saul Niguez", "Trent Alexander-Arnold", "Hakim Ziyech", "Angel Di Maria",
                "Marcelo", "Kai Havertz", "Bruno Fernandes", "Gerard Piqué", "Frenkie de Jong"
        };

        String[] positions = {
                "Goalkeeper", "Defender","Left-back","Right-back",
                "Center-back", "Defensive Midfielder","Central Midfielder",
                "Attacking Midfielder","Left Midfielder","Right Midfielder",
                "Striker","Forward", "Center Forward", "Winger","Sweeper", "Libero",
        };

        String[] managers = {"Jurgen Klopp", "Pep Guardiola", "Zinedine Zidane",
                "Diego Simeone", "Carlo Ancelotti", "Ole Gunnar Solskjaer",
                "Mauricio Pochettino", "Thomas Tuchel", "Antonio Conte",
                "Julian Nagelsmann", "Brendan Rodgers", "Erik ten Hag",
                "Lucien Favre", "Gian Piero Gasperini", "Marcelo Bielsa", "Andrea Pirlo",
                "Steven Gerrard", "Massimiliano Allegri", "Ralph Hasenhuttl", "Nuno Espirito Santo"
        };

        String[] managerTactics = {
                "Gegenpressing", "Tiki-Taka", "Flexible", "Counter-Attack",
                "Balanced", "Attacking", "High Press", "Defensive Solidity",
                "3-5-2 Formation", "Tactical Flexibility", "Possession-based",
                "Total Football", "Attacking Play", "High Intensity",
                "Man-to-Man Marking", "Fluid Attack", "Aggressive Press",
                "Defensive Setup", "High Energy", "Organized Defense"
        };

        Random random = new Random();

        // random player attributes
        int randomName= random.nextInt(0, names.length);
        String playerName = names[randomName];
        int playerAge = random.nextInt(18, 40);
        int randomPosition = random.nextInt(0, positions.length);
        String position = positions[randomPosition];

        // random manager attributes
        int randomManager = random.nextInt(0, managers.length);
        String managerName = managers[randomManager];
        int managerAge = random.nextInt(30, 60);
        int randomTactic = random.nextInt(managerTactics.length);
        String managerTactic = managerTactics[randomTactic];



        Player player = new Player(playerName, playerAge, position);
        Manager manager = new Manager(managerName, managerAge, managerTactic);

        System.out.println(player);
        System.out.println(manager);





    }
}
