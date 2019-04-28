package cz.mg.vulkan;

public class PFNvkCmdSetStencilReference extends VkFunctionPointer {
    public PFNvkCmdSetStencilReference() {
    }

    protected PFNvkCmdSetStencilReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetStencilReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetStencilReference(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilReference(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilReference"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 reference){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getNullAddressNative(), reference != null ? reference.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long faceMask, long reference);


    public void call(VkCommandBuffer commandBuffer, int faceMask, int reference){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask, reference);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int faceMask, int reference);

}
