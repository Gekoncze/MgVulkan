package cz.mg.vulkan;

public class PFNvkCmdDispatch extends VkFunctionPointer {
    public PFNvkCmdDispatch() {
    }

    public PFNvkCmdDispatch(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatch(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDispatch(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatch(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatch"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddress(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddress(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long groupCountX, long groupCountY, long groupCountZ);
}
