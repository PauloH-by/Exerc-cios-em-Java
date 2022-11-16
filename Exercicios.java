/* Exercício 1 Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão". 
    Exiba o valor para o usuário.
     
     String planeta = "Plutão";
     System.out.println(planeta);

     Exercício 2 - Escreva um programa em Java em que o usuário
     informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
     
     System.out.println("Olá! Qual o seu nome?");
     Scanner pergunta1 = new Scanner(System.in);
     String nome = pergunta1.nextLine();
     System.out.println("Olá! " + nome);

     Exercício 3
     Escreva um programa em Java em que o usuário informe o seu nome e em seguida
     o programa perguntará a idade do usuário. Agora o programa deve exibir a
     mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
    
     * System.out.println("Escreva seu nome");
     * Scanner scan = new Scanner(System.in);
     * String nome = scan.nextLine();
     * 
     * System.out.println("Escreva sua idade");
     * int numero = scan.nextInt();
     * 
     * System.out.println(nome + ", sua idade é " + numero);
     * 
     *  Exercício 4
     *  Calcular a área do retangulo
     *  
      Scanner in = new Scanner(System.in);
     * System.out.println("Informe o valor da base do retangulo");
     * 
     * int base = in.nextInt();
     * 
     * System.out.println("Informe o valor da altura do retangulo");
     * int altura = in.nextInt();
     * 
     * System.out.println("O valor da area do retângulo é " + base * altura);
     

     Calcular a área do quadrado
    
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor do lado do quadrado");

    int lado = in.nextInt();

    System.out.println("O valor da area do quadrado é " + lado * lado);

     Calcular a área do trapezio **
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base maior");
    int base_maior = in.nextInt();
    
    System.out.println("Informe o valor da base menor");
    int base_menor = in.nextInt();

    System.out.println("Informe o valor da altura");
    int altura = in.nextInt();
    
    System.out.println("O valor da area do trapezio é " + ((base_maior + base_menor)*altura)/2);

        Paralelogrmo **
         
         Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
            int base = in.nextInt();

        System.out.println("Digite o valor da altura: ");
            int altura = in.nextInt();

        System.out.println("A area do paralelogramo e " + (base * altura));

        Triangulo **

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
            int base = in.nextInt();

        System.out.println("Digite o valor da altura: ");
            int altura = in.nextInt();

        System.out.println("A area do triangulo é " + (base * altura)/2);

        Circulo ** 

         Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
            int raio = in.nextInt();
        System.out.println("A area do circulo é:  " + 3.14 * (raio*raio));
  

    /*Exercício 5
    Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
    
    System.out.println("Escreva um valor");
    Scanner scan = new Scanner(System.in);
    int numero_usuario = scan.nextInt();

    if (numero_usuario < 0){
      System.out.println("Valor negativo");
    } else if (numero_usuario > 0) {
      System.out.println("Valor positivo");
    } else {
      System.out.println("Zeroooooo");
           }
  
  System.out.println("Informe o primeiro número: ");
            Scanner num1 = new Scanner(System.in);
            int valor1 = num1.nextInt();

        System.out.println("Informe o segundo número: ");
            Scanner num2 = new Scanner(System.in);
            int valor2 = num2.nextInt();

        System.out.println("Informe o terceiro número: ");
            Scanner num3 = new Scanner(System.in);
            int valor3 = num3.nextInt();

            if (valor1 > valor2 && valor1 > valor3 ) {
                System.out.println("Número " + valor1 + " e o maior");

            } else if (valor2 > valor1 && valor2 > valor3) {
                System.out.println("Número " + valor2 + " e maior");

            } else {
                System.out.println("Número " + valor3 + " e maior");

            }

            Exercício 6 - Faça um programa para ler 3 valores (considere que não serão
                         informados valores iguais) e escrever o maior deles. 

     System.out.println("Digite o primeiro numero");
    int n1 = scan.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = scan.nextInt();
    System.out.println("Digite o terceiro numero");
    int n3 = scan.nextInt();

     if(n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2) {
        System.out.println("Por favor não informe valores iguais");
     }
     else if (n1 > n2 && n1 > n3) {
        System.out.println(n1 + " foi o maior valor");
     }
     else if (n2 > n1 && n2 > n3) {
        System.out.println(n2 + " foi o maior valor");
     }
     else {
        System.out.println(n3 + " foi o maior valor");
     }

            Exercício 7 ** Faça um programa que leia  3 valores (considere que não serão 
                           informados valores iguais) e escrever a soma dos 2 maiores. 

             System.out.println("Digite um número, por favor: ");
    Scanner n1 = new Scanner(System.in);
    Double num1 = n1.nextDouble();

    System.out.println("Digite um número, por favor: ");
    Scanner n2 = new Scanner(System.in);
    Double num2 = n2.nextDouble();

    System.out.println("Digite um número, por favor: ");
    Scanner n3 = new Scanner(System.in);
    Double num3 = n3.nextDouble();

    if (num1 < num2 && num1 < num3) {
      System.out.println("A soma dos dois maiores número é: " + (num2 + num3));
    }   
            
    if (num2 < num1 && num2 < num3) {
      System.out.println("A soma dos dois maiores número é: " + (num1 + num3));
    }
                
    if (num3 < num2 && num3 < num1) {
      System.out.println("A soma dos dois maiores número é: " + (num1 + num2)); 

Exercício 8 - Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor 
informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor
não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do
 primeiro valor lido pelo segundo valor lido. 

 System.out.println("Digite o primeiro valor: ");
  n1 = scan.nextInt();

  System.out.println("Digite o segundo valor: ");
  n2 = scan.nextInt();

  while(n2 == 0 || n2 < 0) {
    System.out.println("O valor nao pode ser 0! ");
     
    System.out.println("Digite o primeiro valor: ");
    n1 = scan.nextInt();

    System.out.println("Digite o segundo valor: ");
    n2 = scan.nextInt();
  }

   res = (n1 / n2);

   System.out.println("A divisão do numero1 pelo numero 2 é: " + res);

    