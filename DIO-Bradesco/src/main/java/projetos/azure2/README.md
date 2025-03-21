## Este repositório contém o resumo das lições aprendidas durante o desenvolvimento do lab na [DIO](https://web.dio.me/)

No lab nos foi falado sobre o SLA das máquinas virtuais do Microsoft Azure.

SLA (Service Level Agreement) das máquinas virtuais do Azure define o nível mínimo de disponibilidade garantido pela Microsoft para esses serviços. A disponibilidade varia conforme a configuração da VM e o uso de recursos adicionais, como Zonas de Disponibilidade e Conjuntos de Disponibilidade.
Os principais níveis de SLA das VMs do Azure são:
* VM única com discos premium: 99,9% de disponibilidade.
* VM única com discos padrão: Não há SLA garantido.
* VMs em um Conjunto de Disponibilidade: 99,95% de disponibilidade.
* VMs distribuídas em Zonas de Disponibilidade: 99,99% de disponibilidade.
Essas garantias asseguram que o tempo de inatividade será minimizado, e caso a Microsoft não cumpra o SLA, créditos podem ser concedidos aos clientes.