package cz.mg.vulkan;

public class VkFrontFace extends VkEnum {
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;

    public VkFrontFace() {
    }

    protected VkFrontFace(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFrontFace(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFrontFace(int value) {
        setValue(value);
    }

    public VkFrontFace(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_FRONT_FACE_COUNTER_CLOCKWISE) return "VK_FRONT_FACE_COUNTER_CLOCKWISE";
        if(getValue() == VK_FRONT_FACE_CLOCKWISE) return "VK_FRONT_FACE_CLOCKWISE";
        return "UNKNOWN";
    }

    public static class Array extends VkFrontFace implements cz.mg.collections.array.ReadonlyArray<VkFrontFace> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFrontFace.sizeof()));
            this.count = count;
        }

        public Array(VkFrontFace o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFrontFace get(int i){
            return new VkFrontFace(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
