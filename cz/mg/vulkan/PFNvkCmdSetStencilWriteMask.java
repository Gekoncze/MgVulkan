package cz.mg.vulkan;

public class PFNvkCmdSetStencilWriteMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilWriteMask() {
    }

    public PFNvkCmdSetStencilWriteMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilWriteMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetStencilWriteMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilWriteMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilWriteMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 writeMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getNullAddress(), writeMask != null ? writeMask.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long faceMask, long writeMask);
}
