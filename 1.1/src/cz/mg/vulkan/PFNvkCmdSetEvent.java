package cz.mg.vulkan;

public class PFNvkCmdSetEvent extends VkFunctionPointer {
    public PFNvkCmdSetEvent() {
    }

    protected PFNvkCmdSetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetEvent(long value) {
        setValue(value);
    }

    public PFNvkCmdSetEvent(VkInstance instance) {
        super(instance, new VkString("vkCmdSetEvent"));
    }

    public void call(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative(), stageMask != null ? stageMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long event, long stageMask);
}
