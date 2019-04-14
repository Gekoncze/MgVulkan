package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddress(), pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long objectTable, long objectCount, long pObjectEntryTypes, long pObjectIndices, long rval);
}
