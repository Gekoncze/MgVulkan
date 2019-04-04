package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueue.html">khronos documentation</a>
 **/
public class VkQueue extends VkDispatchableHandle {
    public VkQueue() {
    }

    public VkQueue(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueue(long handle) {
        setValue(handle);
    }

    public static class Array extends VkQueue implements cz.mg.collections.array.ReadonlyArray<VkQueue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueue.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueue o){
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkQueue get(int i){
            return new VkQueue(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkQueue.Pointer implements cz.mg.collections.array.ReadonlyArray<VkQueue.Pointer> {
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

            public Array(VkQueue[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkQueue.Pointer get(int i){
                return new VkQueue.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
