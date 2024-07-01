public class NameGenerator {
    public static String generateStarWarsName(String firstName, String lastName, String motherMaidenName, String birthCity) {
        // Pegue as três primeiras letras do sobrenome
        String part1 = lastName.substring(0, 3);
        
        // Adicione a ele as duas primeiras letras do primeiro nome
        String part2 = firstName.substring(0, 2);
        
        // Pegue as duas primeiras letras do sobrenome de solteira da mãe
        String part3 = motherMaidenName.substring(0, 2);
        
        // Adicione a ele as três primeiras letras do nome da cidade de nascimento
        String part4 = birthCity.substring(0, 3);
        
        // Combine as partes para criar o nome Star Wars
        String starWarsName = part1 + part2 + " " + part3 + part4;
        
        return starWarsName;
    }

    public static void main(String[] args) {
        String firstName = "SeuPrimeiroNome";
        String lastName = "SeuSobrenome";
        String motherMaidenName = "SobrenomeMae";
        String birthCity = "CidadeNascimento";

        String starWarsName = generateStarWarsName(firstName, lastName, motherMaidenName, birthCity);
        System.out.println("Seu nome Star Wars: " + starWarsName);
    }
}
