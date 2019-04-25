package cz.mg.vulkan;

public class PFNvkCmdResetEvent extends VkFunctionPointer {
    public PFNvkCmdResetEvent() {
    }

    protected PFNvkCmdResetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdResetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdResetEvent(long value) {
        setValue(value);
    }

    public PFNvkCmdResetEvent(VkInstance instance) {
        super(instance, new VkString("vkCmdResetEvent"));
    }

    public void call(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative(), stageMask != null ? stageMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long event, long stageMask);
}
