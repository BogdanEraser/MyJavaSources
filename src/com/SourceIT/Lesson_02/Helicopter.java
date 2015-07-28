package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes Helicopter, based on flying object
 *
 */
public class Helicopter extends FlyingObject
    {
        private byte engineQuantity;
        private byte bladesQuantity;

        public byte getEngineQuantity()
        {
            return engineQuantity;
        }

        public void setEngineQuantity(byte engineQuantity)
        {
            this.engineQuantity = engineQuantity;
        }

        public byte getBladesQuantity()
        {
            return bladesQuantity;
        }

        public void setBladesQuantity(byte bladesQuantity)
        {
            this.bladesQuantity = bladesQuantity;
        }

        public void flyingPrinciple()
        {
            System.out.println("Принцип полета - подъемная сила от лопастей вращающегося винта");
        }

        public Helicopter()
        {
            this.engineQuantity = 1;    //минимум 1 двигатель
            this.bladesQuantity = 2;    //и 2 лопасти
        }
        public Helicopter(byte engineQuantity, byte bladesQuantity)
        {
            this.engineQuantity = engineQuantity;
            this.bladesQuantity = bladesQuantity;
        }

        @Override
        protected void takeOff()
        {
            this.setzCoordinate(getzCoordinate()+10);  //увеличиваем высоту на 10
        }
    }


