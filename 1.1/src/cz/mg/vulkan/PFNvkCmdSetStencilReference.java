package cz.mg.vulkan;

public class PFNvkCmdSetStencilReference extends VkFunctionPointer {
    public PFNvkCmdSetStencilReference() {
    }

    public PFNvkCmdSetStencilReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetStencilReference(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilReference(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilReference"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 reference){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getNullAddressNative(), reference != null ? reference.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long faceMask, long reference);
}
