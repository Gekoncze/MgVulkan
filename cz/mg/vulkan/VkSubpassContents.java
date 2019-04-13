package cz.mg.vulkan;

public class VkSubpassContents extends VkEnum {
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

    public VkSubpassContents() {
    }

    public VkSubpassContents(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassContents(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSubpassContents(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SUBPASS_CONTENTS_INLINE) return "VK_SUBPASS_CONTENTS_INLINE";
        if(getValue() == VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS) return "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS";
        return "UNKNOWN";
    }

    public static class Array extends VkSubpassContents implements cz.mg.collections.array.ReadonlyArray<VkSubpassContents> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassContents.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubpassContents o){
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
        public VkSubpassContents get(int i){
            return new VkSubpassContents(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
