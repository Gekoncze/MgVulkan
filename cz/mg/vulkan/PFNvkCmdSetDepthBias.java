package cz.mg.vulkan;

public class PFNvkCmdSetDepthBias extends VkFunctionPointer {
    public PFNvkCmdSetDepthBias() {
    }

    public PFNvkCmdSetDepthBias(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDepthBias(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDepthBias(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBias(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBias"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat depthBiasConstantFactor, VkFloat depthBiasClamp, VkFloat depthBiasSlopeFactor){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.getSinkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getSinkAddress(), depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long depthBiasConstantFactor, long depthBiasClamp, long depthBiasSlopeFactor);
}
