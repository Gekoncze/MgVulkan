package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBeginCommandBuffer.html">khronos documentation</a>
 **/
public class PFNvkBeginCommandBuffer extends VkFunctionPointer {
    public PFNvkBeginCommandBuffer() {
    }

    public PFNvkBeginCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBeginCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBeginCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkBeginCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkBeginCommandBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo, VkResult rval){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), pBeginInfo != null ? pBeginInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pBeginInfo, long rval);
}
