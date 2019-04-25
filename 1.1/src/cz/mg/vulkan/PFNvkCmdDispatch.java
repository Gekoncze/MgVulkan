package cz.mg.vulkan;

public class PFNvkCmdDispatch extends VkFunctionPointer {
    public PFNvkCmdDispatch() {
    }

    protected PFNvkCmdDispatch(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDispatch(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatch(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatch(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatch"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddressNative(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddressNative(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long groupCountX, long groupCountY, long groupCountZ);
}
