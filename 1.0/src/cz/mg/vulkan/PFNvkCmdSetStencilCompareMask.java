package cz.mg.vulkan;

public class PFNvkCmdSetStencilCompareMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilCompareMask() {
    }

    protected PFNvkCmdSetStencilCompareMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetStencilCompareMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetStencilCompareMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilCompareMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilCompareMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 compareMask){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getNullAddressNative(), compareMask != null ? compareMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long faceMask, long compareMask);


    public void call(VkCommandBuffer commandBuffer, int faceMask, int compareMask){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask, compareMask);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int faceMask, int compareMask);

}
