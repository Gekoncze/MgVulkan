package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModule.html">khronos documentation</a>
 **/
public class VkShaderModule extends VkNonDispatchableHandle {
    public VkShaderModule() {
    }

    public VkShaderModule(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderModule(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderModule(long handle) {
        setValue(handle);
    }

    public static class Array extends VkShaderModule implements cz.mg.collections.array.ReadonlyArray<VkShaderModule> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderModule.sizeof()));
            this.count = count;
        }

        public Array(int count, VkShaderModule o){
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
        public VkShaderModule get(int i){
            return new VkShaderModule(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkShaderModule.Pointer implements cz.mg.collections.array.ReadonlyArray<VkShaderModule.Pointer> {
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

            public Array(VkShaderModule[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkShaderModule.Pointer get(int i){
                return new VkShaderModule.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
