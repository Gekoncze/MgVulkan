package cz.mg.vulkan;

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
}
