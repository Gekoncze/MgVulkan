package cz.mg.vulkan;

public class PFNvkCmdSetStencilWriteMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilWriteMask() {
    }

    protected PFNvkCmdSetStencilWriteMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetStencilWriteMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetStencilWriteMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilWriteMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilWriteMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 writeMask){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getNullAddressNative(), writeMask != null ? writeMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long faceMask, long writeMask);


    public void call(VkCommandBuffer commandBuffer, int faceMask, int writeMask){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask, writeMask);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int faceMask, int writeMask);

}
