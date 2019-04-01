package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDepthBounds.html">khronos documentation</a>
 **/
public class PFNvkCmdSetDepthBounds extends VkFunctionPointer {
    public PFNvkCmdSetDepthBounds() {
    }

    public PFNvkCmdSetDepthBounds(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDepthBounds(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDepthBounds(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBounds(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBounds"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat minDepthBounds, VkFloat maxDepthBounds){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, minDepthBounds != null ? minDepthBounds.getVkAddress() : VkPointer.NULL_ADDRESS, maxDepthBounds != null ? maxDepthBounds.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long minDepthBounds, long maxDepthBounds);
}
