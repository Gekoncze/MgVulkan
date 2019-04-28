package cz.mg.vulkan;

public class PFNvkCmdNextSubpass extends VkFunctionPointer {
    public PFNvkCmdNextSubpass() {
    }

    protected PFNvkCmdNextSubpass(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdNextSubpass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdNextSubpass(long value) {
        setValue(value);
    }

    public PFNvkCmdNextSubpass(VkInstance instance) {
        super(instance, new VkString("vkCmdNextSubpass"));
    }

    public void call(VkCommandBuffer commandBuffer, int contents){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), contents);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int contents);

}
