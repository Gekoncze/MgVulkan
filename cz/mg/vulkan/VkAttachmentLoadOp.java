package cz.mg.vulkan;

public class VkAttachmentLoadOp extends VkEnum {
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

    public VkAttachmentLoadOp() {
    }

    public VkAttachmentLoadOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentLoadOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkAttachmentLoadOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_ATTACHMENT_LOAD_OP_LOAD) return "VK_ATTACHMENT_LOAD_OP_LOAD";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_CLEAR) return "VK_ATTACHMENT_LOAD_OP_CLEAR";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_DONT_CARE) return "VK_ATTACHMENT_LOAD_OP_DONT_CARE";
        return "UNKNOWN";
    }

    public static class Array extends VkAttachmentLoadOp implements cz.mg.collections.array.ReadonlyArray<VkAttachmentLoadOp> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentLoadOp.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAttachmentLoadOp o){
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
        public VkAttachmentLoadOp get(int i){
            return new VkAttachmentLoadOp(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
