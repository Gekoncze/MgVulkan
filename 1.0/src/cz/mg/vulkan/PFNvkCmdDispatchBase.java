package cz.mg.vulkan;

public class PFNvkCmdDispatchBase extends VkFunctionPointer {
    public PFNvkCmdDispatchBase() {
    }

    protected PFNvkCmdDispatchBase(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDispatchBase(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchBase(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchBase(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchBase"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.getNullAddressNative(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddressNative(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddressNative(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);


    public void call(VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ);

}
