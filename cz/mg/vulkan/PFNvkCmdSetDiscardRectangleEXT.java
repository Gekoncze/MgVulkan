package cz.mg.vulkan;

public class PFNvkCmdSetDiscardRectangleEXT extends VkFunctionPointer {
    public PFNvkCmdSetDiscardRectangleEXT() {
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDiscardRectangleEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDiscardRectangleEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstDiscardRectangle, VkUInt32 discardRectangleCount, VkRect2D pDiscardRectangles){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), firstDiscardRectangle != null ? firstDiscardRectangle.getVkAddress() : VkPointer.getSinkAddress(), discardRectangleCount != null ? discardRectangleCount.getVkAddress() : VkPointer.getSinkAddress(), pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstDiscardRectangle, long discardRectangleCount, long pDiscardRectangles);
}
