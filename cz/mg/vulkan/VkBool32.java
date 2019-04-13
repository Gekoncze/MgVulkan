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

    public VkBool32(long value){
        this((int)value);
    }

    public VkBool32(boolean value){
        this(value == false ? Vk.VK_FALSE : Vk.VK_TRUE);
    }

    public void setValue(long value){
        setValue((int)value);
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

        public Array(long... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        public Array(boolean... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i] == false ? Vk.VK_FALSE : Vk.VK_TRUE);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkBool32 get(int i){
            return new VkBool32(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkBool32.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBool32.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkBool32[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBool32.Pointer get(int i){
                return new VkBool32.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
