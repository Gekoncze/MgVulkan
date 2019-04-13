package cz.mg.vulkan;

public class VkAttachmentStoreOp extends VkEnum {
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

    public VkAttachmentStoreOp() {
    }

    public VkAttachmentStoreOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentStoreOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAttachmentStoreOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_ATTACHMENT_STORE_OP_STORE) return "VK_ATTACHMENT_STORE_OP_STORE";
        if(getValue() == VK_ATTACHMENT_STORE_OP_DONT_CARE) return "VK_ATTACHMENT_STORE_OP_DONT_CARE";
        return "UNKNOWN";
    }

    public static class Array extends VkAttachmentStoreOp implements cz.mg.collections.array.ReadonlyArray<VkAttachmentStoreOp> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentStoreOp.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAttachmentStoreOp o){
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
        public VkAttachmentStoreOp get(int i){
            return new VkAttachmentStoreOp(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
