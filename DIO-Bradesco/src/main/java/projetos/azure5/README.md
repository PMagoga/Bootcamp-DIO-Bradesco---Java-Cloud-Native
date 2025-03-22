## Este repositório contém o resumo das lições aprendidas durante o desenvolvimento do lab na [DIO](https://web.dio.me/)

Durante o lab a instrutora mostrou com fazer a configuração de máquinas virtuais dentre a oito abas para 
configuração de máquinas virtuais, dentre as configurações temos:

A configuração de recursos e dimensionamento de máquinas virtuais (VMs) na Microsoft Azure é um processo essencial para otimizar desempenho, custos e escalabilidade.

1. Escolha do Tipo de Máquina Virtual
   A Azure oferece diferentes séries de VMs para atender a diversas necessidades, como:

Série B – Baixo custo, para cargas de trabalho leves.
Série D e E – Otimizadas para desempenho geral e memória intensiva.
Série F e H – Para cargas de trabalho computacionais intensivas.
Série N – Para uso de GPUs em aplicações gráficas ou IA.

2. Configuração de Recursos
   Ao criar uma VM, é necessário configurar recursos como:
* vCPUs e Memória RAM – Definem a capacidade de processamento.
* Armazenamento – Escolha entre discos HDD, SSD padrão ou SSD premium.
* Rede – Configuração de IPs, NSGs (Network Security Groups) e balanceadores de carga.

3. Dimensionamento e Escalabilidade
   A Azure permite dimensionamento sob demanda:

* Escala Vertical (Scale Up/Down) – Aumento ou redução da capacidade da VM.
* Escala Horizontal (Scale Out/In) – Adição ou remoção de instâncias de VMs em um conjunto de escala (Scale Set).

4. Estratégias de Otimização
   Utilizar Azure Advisor para recomendações de performance e custo.
* Configurar Auto Scaling para ajustar recursos conforme a demanda.
* Escolher reservas de capacidade para reduzir custos em longo prazo.