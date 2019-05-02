package cz.mg.vulkan;

public class VkBool32 extends VkUInt32 {
    public VkBool32() {
    }

    protected VkBool32(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBool32(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBool32(VkPointer pointer) {
        super(pointer);
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

        public Array(VkBool32 o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkBool32 get(int i){
            return new VkBool32(getVkMemory(), address(i));
        }

        protected long address(int i){
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
