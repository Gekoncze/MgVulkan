package cz.mg.vulkan;

public class VkBool32 extends VkUInt32 {
    public VkBool32() {
    }

    public VkBool32(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBool32(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBool32(boolean value){
        this(value == false ? Vk.VK_FALSE : Vk.VK_TRUE);
    }

    @Override
    public String toString(){
        return getValue() == Vk.VK_FALSE ? "VK_FALSE" : "VK_TRUE";
    }

    public VkBool32(int value) {
        setValue(value);
    }

    public static class Array extends VkBool32 implements cz.mg.collections.array.ReadonlyArray<VkBool32> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBool32.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBool32 o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
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
        public VkBool32 get(int i){
            return new VkBool32(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
