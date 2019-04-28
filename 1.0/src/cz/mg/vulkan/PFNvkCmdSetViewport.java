package cz.mg.vulkan;

public class PFNvkCmdSetViewport extends VkFunctionPointer {
    public PFNvkCmdSetViewport() {
    }

    protected PFNvkCmdSetViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetViewport(long value) {
        setValue(value);
    }

    public PFNvkCmdSetViewport(VkInstance instance) {
        super(instance, new VkString("vkCmdSetViewport"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewport pViewports){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstViewport != null ? firstViewport.getVkAddress() : VkPointer.getNullAddressNative(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddressNative(), pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewports);


    public void call(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, VkViewport pViewports){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstViewport, viewportCount, pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int firstViewport, int viewportCount, long pViewports);

}
