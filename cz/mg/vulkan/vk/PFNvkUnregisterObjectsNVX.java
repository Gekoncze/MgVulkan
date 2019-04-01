package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUnregisterObjectsNVX.html">khronos documentation</a>
 **/
public class PFNvkUnregisterObjectsNVX extends VkFunctionPointer {
    public PFNvkUnregisterObjectsNVX() {
    }

    public PFNvkUnregisterObjectsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkUnregisterObjectsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkUnregisterObjectsNVX(long value) {
        setValue(value);
    }

    public PFNvkUnregisterObjectsNVX(VkInstance instance) {
        super(instance, new VkString("vkUnregisterObjectsNVX"));
    }

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, objectTable != null ? objectTable.getVkAddress() : VkPointer.NULL_ADDRESS, objectCount != null ? objectCount.getVkAddress() : VkPointer.NULL_ADDRESS, pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long objectTable, long objectCount, long pObjectEntryTypes, long pObjectIndices, long rval);
}
