package familyaccount;

public class FamilyAccount {
	public static void main(String[] args) {
		boolean isFlag = true;
		
		//���ڼ�¼�û������֧��������
		String details="��֧\t\t�˻����\t\t��֧���\t\t˵��\n";
		//��ʼ���
		int balance=10000;
		
		while (isFlag) {
			System.out.println("-------------------��ͥ��֧�������---------------------\n");
			System.out.println("                    1  ��֧��ϸ");
			System.out.println("                    2  �Ǽ�����");
			System.out.println("                    3  �Ǽ�֧��");
			System.out.println("                    4  ��        ��\n");
			System.out.print("\t\t��ѡ��<1-4>:");
			//��ȡ�û���ѡ��:1-4
			char selection = Utility.readMenuSelection();
			switch (selection) {
			case '1':
//				System.out.println("1.��֧��ϸ");
				System.out.println("-------------------��ǰ��֧��ϸ��¼---------------------");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
//				System.out.println("2.�Ǽ�����");
				System.out.println("����������:");
				int addMoney = Utility.readNumber();
				System.out.println("��������˵��:");
				String addInfo = Utility.readString();
				
				//�������
				balance+=addMoney;
				//����details
				details+=("����\t\t"+balance+"\t\t"+addMoney+"\t\t"+addInfo+"\n");
				
				System.out.println("---------------------�Ǽ����-----------------------");
				break;
			case '3':
//				System.out.println("3.�Ǽ�֧��");
				System.out.println("����֧�����:");
				int  minusMoney = Utility.readNumber();
				System.out.println("����֧��˵��:");
				String minusInfo = Utility.readString();
				
				//�������
				if (minusMoney<=balance) {
					balance-=minusMoney;
					//����details
					details+=("֧��\t\t"+balance+"\t\t"+minusMoney+"\t\t"+minusInfo+"\n");
				}else {
					System.out.println("֧�������˻�,֧��ʧ��!");
				}
				
				System.out.println("---------------------�Ǽ����-----------------------");
				break;
			case '4':
				System.out.println("ȷ���Ƿ��˳�(Y/N):");
				char isExit = Utility.readConfiguration();
				if (isExit=='Y') {
					isFlag=false;
				}
				break;
				
			}
		}
	}
}
