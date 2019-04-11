package cz.mg.vulkan;

public class PFNvkCmdNextSubpass extends VkFunctionPointer {
    public PFNvkCmdNextSubpass() {
    }

    public PFNvkCmdNextSubpass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdNextSubpass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdNextSubpass(long value) {
        setValue(value);
    }

    public PFNvkCmdNextSubpass(VkInstance instance) {
        super(instance, new VkString("vkCmdNextSubpass"));
    }

    public void call(VkCommandBuffer commandBuffer, VkSubpassContents contents){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), contents != null ? contents.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long contents);
}
