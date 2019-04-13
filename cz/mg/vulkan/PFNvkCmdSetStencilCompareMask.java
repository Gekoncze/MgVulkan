package cz.mg.vulkan;

public class PFNvkCmdSetStencilCompareMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilCompareMask() {
    }

    public PFNvkCmdSetStencilCompareMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilCompareMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetStencilCompareMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilCompareMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilCompareMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 compareMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), faceMask != null ? faceMask.getVkAddress() : VkPointer.getSinkAddress(), compareMask != null ? compareMask.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long faceMask, long compareMask);
}
