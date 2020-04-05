import java.util.Scanner;



public class iSoccer
{
    static int line = 100, column = 10;
    static String[][] employees = new String[line][column];
    static int[] stadiumControl = new int[4];



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String loginSystem = "adm";
        String passwordSystem = "000";
        String loginEnter, passwordEnter;

        int keyControl = 1, keyEmployee, keyResource, centerSleep = 0;
        int busControl = 0, centerControl = 0, auxEmployees = -1;
        stadiumControl[0] = 0;


        while(keyControl > 0 && keyControl < 5)
        {
            System.out.println("Insira o Login do Admnistrador:");
            loginEnter = input.nextLine();
            System.out.println("Insira a Senha do Admistrador:");
            passwordEnter = input.nextLine();

            if(!loginEnter.equals(loginSystem) || !passwordEnter.equals(passwordSystem))
            {
                System.out.println("Login ou Senha estão Incorretos");

            }
            else
            {
                System.out.println("Bem Vindo ao Menu iSoccer");
                System.out.println("Digite (0) para Sair da Aplicação");
                System.out.println("Digite (1) para Adicionar Funcionários");
                System.out.println("Digite (2) para Adicionar Sócios-Torcedores");
                System.out.println("Digite (3) para Gerenciar Recursos da Equipe");
                System.out.println("Digite (4) para Solicitar Relatórios da Equipe");

                keyControl = input.nextInt();

                if(keyControl == 1)
                {
                    System.out.println("Adicionando os Funcionários...");
                    System.out.println("Digite (0) para Adicionar um Presidente");
                    System.out.println("Digite (1) para Adicionar um Médico");
                    System.out.println("Digite (2) para Adicionar um Técnico");
                    System.out.println("Digite (3) para Adicionar um Preparador Físico");
                    System.out.println("Digite (4) para Adicionar um Motorista");
                    System.out.println("Digite (5) para Adicionar um Cozinheiro");
                    System.out.println("Digite (6) para Adicionar um Advogado");
                    System.out.println("Digite (7) para Adicionar um Jogador");

                    keyEmployee = input.nextInt();

                    if(keyEmployee == 0)
                    {
                        System.out.println("Adicionando um Presidente na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(0);
                        employees[auxEmployees][8] = Integer.toString(0);

                        for(int cont = 2; cont < 8; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }
                    }
                    else if(keyEmployee == 1)
                    {
                        System.out.println("Adicionando um Médico na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, CRM, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(1);

                        for(int cont = 2; cont < 9; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }

                    }
                    else if(keyEmployee == 2)
                    {
                        System.out.println("Adicionando um Treinador na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(2);
                        employees[auxEmployees][8] = Integer.toString(0);

                        for(int cont = 2; cont < 8; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }

                    }
                    else if(keyEmployee == 3)
                    {
                        System.out.println("Adicionando um Preparador Físico na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(3);
                        employees[auxEmployees][8] = Integer.toString(0);

                        for(int cont = 2; cont < 8; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }

                    }
                    else if(keyEmployee == 4)
                    {
                        System.out.println("Adicionando um Motorista na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, Número de Habilitação, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(4);

                        for(int cont = 2; cont < 9; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }

                    }
                    else if(keyEmployee == 5)
                    {
                        System.out.println("Adicionando um Conzinheiro na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(5);
                        employees[auxEmployees][8] = Integer.toString(0);

                        for(int cont = 2; cont < 8; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                            
                        }


                    }
                    else if(keyEmployee == 6)
                    {
                        System.out.println("Adicionando um Advogado na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(6);
                        employees[auxEmployees][8] = Integer.toString(0);

                        for(int cont = 2; cont < 8; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }


                    }
                    else if(keyEmployee == 7)
                    {
                        System.out.println("Adicionando um Jogador na Equipe...");
                        System.out.println("Informe o Nome Completo, E-Mail, CPF, Salário, Telefone, Tipo de Jogador (Goleiro, Zagueiro, Lateral Direito, Lateiro Esquerdo, Volante, Meia, Atacante), Apto(0) ou Inapto(1), nesta ordem:");

                        auxEmployees++;
                        employees[auxEmployees][0] = Integer.toString(auxEmployees);
                        employees[auxEmployees][1] = Integer.toString(7);

                        for(int cont = 2; cont < 10; cont++)
                        {
                            employees[auxEmployees][cont]= input.nextLine();
                        }
                    }
                    else
                    {
                        System.out.println("Erro!!!");
                    }

                }
                else if(keyControl == 2)
                {
                    System.out.println("Adicionando Sócio-Torcedores...");
                    System.out.println("Informe o Nome Completo, E-Mail, CPF, Telefone, tipo de Sócio (Júnior, Sênior, Elite), Valor de Contribuição(100, 50, 30), (Situação (0) Adiplente (1) Inadiplente), nesta ordem:");

                    auxEmployees++;
                    employees[auxEmployees][0] = Integer.toString(auxEmployees);
                    employees[auxEmployees][1] = Integer.toString(8);

                    for(int cont = 2; cont < 10; cont++)
                    {
                        employees[auxEmployees][cont]= input.nextLine();
                    }
                }
                else if(keyControl == 3)
                {
                    System.out.println("Gerenciando os Recursos da Equipe...");
                    System.out.println("Digite (0) para Gerenciar os Recursos do Ônibus");
                    System.out.println("Digite (1) para Gerenciar os Recursos do Estádio");
                    System.out.println("Digite (2) para Gerenciar os Recursos do Centro de Treinamento");

                    keyResource = input.nextInt();

                    if(keyResource == 0)
                    {
                        System.out.println("Gerenciando os Recursos do Ônibus...");
                        System.out.println("Adicionar/Verificar este Recurso:");

                        if(busControl == 0)
                        {
                            System.out.println("Você pode Adicionar esse Recurso...");
                            System.out.println("Adicionando Ônibus...");
                            busControl++;
                        }
                        else if(busControl > 0)
                        {
                            System.out.println("Este Recurso não Está Indisponível...");
                        }
                    }
                    else if(keyResource == 1)
                    {
                        System.out.println("Gerenciando os Recursos do Estádio...");
                        System.out.println("Adicionar/Verificar este Recurso:");

                        if(stadiumControl[0] == 0)
                        {
                            System.out.println("Você pode Adicionar esse Recurso...");
                            System.out.println("Adicionando Estádio...");
                            System.out.println("Informe a Lotação, Quantidade dos Banheiros, Quantidade de Lanchonetes, nesta ordem:");

                            stadiumControl[0]++;
                            stadiumControl[1] = input.nextInt();
                            stadiumControl[2] = input.nextInt();
                            stadiumControl[3] = input.nextInt();
                        }
                        else if(stadiumControl[0] > 0)
                        {
                            System.out.println("Este Recurso Está Indisponível...");                           
                        }
                    }
                    else if(keyResource == 2)
                    {
                        System.out.println("Gerenciando os Recursos do Centro de Treinamento...");
                        System.out.println("Verificar este Recurso:");

                        if(centerControl == 0)
                        {
                            System.out.println("Recurso Disponível...");
                            System.out.println("Informe Quantos Dormitórios Existem");
                            centerSleep = input.nextInt();
                            centerControl++;
                        }
                        else if(centerControl > 0)
                        {
                            System.out.println("Recurso não Disponível...");
                        }
                    }
                }
                else if(keyControl == 4)
                {
                    System.out.println("Informando os Relatórios da Equipe...");
                    System.out.println("Digite (0) para o Relatório dos Funcionários");
                    System.out.println("Digite (1) para o Relatório dos Recursos Físicos");
                    System.out.println("Digite (2) para o Relatório dos Sócios-Torcedores");

                    int keyReport = input.nextInt();

                    if(keyReport == 0)
                    {
                        System.out.println("Relatório dos Funcionários...");
                        System.out.println("Digite (0) para o Relatório do Time");
                        System.out.println("Digite (1) para o Relatório dos Serviços Gerais");

                        int reportEmployees = input.nextInt();

                        if(reportEmployees == 0)
                        {
                            System.out.println("Relatório do Time");
                            System.out.println("Digite (0) para os Dados do Time(Jogadores, Tecnicos)");
                            System.out.println("Digite (1) para Aptidão de Cada Jogador");

                            int reportTeam = input.nextInt();

                            if(reportTeam == 0)
                            {

                                for(int cont = 0; cont < auxEmployees + 1; cont++)
                                {
                                    if(Integer.parseInt(employees[cont][1]) == 2)
                                    {
                                        System.out.println("Treinador:");
                                        for(int cont1 = 2; cont1 < 8; cont1++)
                                        {
                                            System.out.println(employees[cont][cont1]);
                                        }
                                    }
                                    if(Integer.parseInt(employees[cont][1]) == 7)
                                    {
                                        System.out.println("Jogador:");
                                        for(int cont1 = 2; cont1 < 9; cont1++)
                                        {
                                            System.out.println(employees[cont][cont1]);
                                        }
                                    }
                                }
                            }
                            else if(reportTeam == 1)
                            {
                                for(int cont = 0; cont < auxEmployees + 1; cont++)
                                {
                                    if(Integer.parseInt(employees[cont][9]) == 0)
                                    {
                                        System.out.println("Apto: " + employees[cont][3]);
                                    }
                                    else if(Integer.parseInt(employees[cont][9]) == 1)
                                    {
                                        System.out.println("Inapto: " + employees[cont][3]);
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Erro!!");
                            }
                        }
                        else if(reportEmployees == 1)
                        {
                            System.out.println("Relatório dos Serviços Gerais do Time");

                            for(int cont = 0; cont < auxEmployees + 1; cont++)
                            {
                                if(Integer.parseInt(employees[cont][1]) == 0)
                                {
                                    System.out.println("Presidente:");
                                    for(int cont1 = 2; cont1 < 8; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                                else if(Integer.parseInt(employees[cont][1]) == 1)
                                {
                                    System.out.println("Médico:");
                                    for(int cont1 = 2; cont1 < 9; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                                else if(Integer.parseInt(employees[cont][1]) == 3)
                                {
                                    System.out.println("Preparador Físico:");
                                    for(int cont1 = 2; cont1 < 8; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                                else if(Integer.parseInt(employees[cont][1]) == 4)
                                {
                                    System.out.println("Motorista:");
                                    for(int cont1 = 2; cont1 < 9; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                                else if(Integer.parseInt(employees[cont][1]) == 5)
                                {
                                    System.out.println("Cozinheiro:");
                                    for(int cont1 = 2; cont1 < 8; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                                else if(Integer.parseInt(employees[cont][1]) == 6)
                                {
                                    System.out.println("Advogado:");
                                    for(int cont1 = 2; cont1 < 8; cont1++)
                                    {
                                        System.out.println(employees[cont][cont1]);
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Erro!!!");
                        }
                    }
                    else if(keyReport == 1)
                    {
                        System.out.println("Relatório dos Recursos Físicos...");

                        if(busControl == 0)
                        {
                            System.out.println("A Equipe não tem Ônibus");
                        }
                        else if(busControl == 1)
                        {
                            System.out.println("A Equipe tem Ônibus");
                        }
                        if(stadiumControl[0] == 0)
                        {
                            System.out.println("A Equipe não tem Estádio");
                        }
                        else if(stadiumControl[0] == 1)
                        {
                            System.out.println("A Equipe tem Estádio");
                            System.out.println("Com Lotação de: " + stadiumControl[1]);
                            System.out.println("Com " + stadiumControl[2] + " Banheiros");
                            System.out.println("Com " + stadiumControl[3] + " Lanchonetes");
                        }
                        if(centerControl == 0)
                        {
                            System.out.println("A Equipe não tem Centro de Treinamento");
                        }
                        else if(centerControl == 1)
                        {
                            System.out.println("A Equipe tem Centro de Treinamento");
                            
                            System.out.println("Com " + centerSleep + " Dormitórios");
                        }
                    }
                    else if(keyReport == 2)
                    {
                        System.out.println("Relatório dos Sócios-Torcedores...");
                        System.out.println("Digite (0) para a Quantidade dos Sócios-Torcedadores");
                        System.out.println("Digite (1) para a Quantidade dos Adiplentes e Inadiplentes");
                        System.out.println("Digite (2) para a Lista com os dados dos Sócios-Torcedores");
                        System.out.println("Digite (3) para Alterar o Estado do Pagamento dos Sócios-Torcedores");

                        int keyFan, countFan = 0, countAd = 0, countIn = 0;
                        keyFan = input.nextInt();

                        if(keyFan == 0)
                        {
                            for(int cont = 0; cont < auxEmployees + 1; cont++)
                            {
                                if(Integer.parseInt(employees[cont][1]) == 8)
                                {
                                    countFan++;
                                }
                            }
                            System.out.println(countFan +" Sócios Torcedores");
                        }
                        else if(keyFan == 1)
                        {
                            for(int cont = 0; cont < auxEmployees + 1; cont++)
                            {
                                if(Integer.parseInt(employees[cont][1]) == 8)
                                {
                                    if(Integer.parseInt(employees[cont][9]) == 0)
                                    {
                                        countAd++;
                                    }
                                    else if(Integer.parseInt(employees[cont][9]) == 1)
                                    {
                                        countIn++;
                                    }
                                }
                            }

                            System.out.println("Temos " + countAd + " Adimplentes");
                            System.out.println("Temos " + countIn + " Inadimplentes");
                        }
                        else if(keyFan == 2)
                        {
                            for(int cont = 0; cont < auxEmployees + 1; cont++)
                            {
                                if(Integer.parseInt(employees[cont][1]) == 8)
                                {
                                    System.out.println("Sócio:");
                                    
                                    if(Integer.parseInt(employees[cont][9]) == 0)
                                    {
                                        for(int cont1 = 2; cont1 < 9; cont1++)
                                        {                                       
                                            System.out.println(employees[cont][cont1]);
                                        }
                                        System.out.println("Adimplente");
                                    }
                                    if(Integer.parseInt(employees[cont][9]) == 1)
                                    {
                                        for(int cont1 = 2; cont1 < 9; cont1++)
                                        {                                       
                                            System.out.println(employees[cont][cont1]);
                                        }
                                        System.out.println("Inadimplente");
                                    }
                                    
                                }
                            }
                        }
                        else if(keyFan == 3)
                        {
                            System.out.println("Digite o Id do Sócio-Torcedor");
                            int keyIdfan = input.nextInt();
                            
                            if(Integer.parseInt(employees[keyIdfan][1]) == 8)
                            {
                                System.out.println("Atualize para (0)Adimplente ou (1)Inadiplente");
                                
                                employees[keyIdfan][9] = input.nextLine();
                            }
                            else
                            {
                                System.out.println("Erro!! O Id Não é de Torcedor");
                            }
                        }
                        else
                        {
                            System.out.println("Erro!!");
                        }


                    }
                }
                else
                {
                    System.out.println("Erro!!!");
                }
            }
        }
    }
}