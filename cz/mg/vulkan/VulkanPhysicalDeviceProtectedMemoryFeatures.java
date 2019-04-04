package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceProtectedMemoryFeatures.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceProtectedMemoryFeatures extends VulkanObject {
    public VulkanPhysicalDeviceProtectedMemoryFeatures(){
        super(new VkPhysicalDeviceProtectedMemoryFeatures());
    }

    public VulkanPhysicalDeviceProtectedMemoryFeatures(VkPhysicalDeviceProtectedMemoryFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceProtectedMemoryFeatures getVk(){
        return (VkPhysicalDeviceProtectedMemoryFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceProtectedMemoryFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 protectedMemory) {
        super(new VkPhysicalDeviceProtectedMemoryFeatures(sType.getVk(), pNext.getVk(), protectedMemory.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanBool32 getProtectedMemory() {
        return new VulkanBool32(getVk().getProtectedMemory());
    }

    public void setProtectedMemory(VulkanBool32 protectedMemory) {
        getVk().setProtectedMemory(protectedMemory.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceProtectedMemoryFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProtectedMemoryFeatures> {
        public Array(VkPhysicalDeviceProtectedMemoryFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceProtectedMemoryFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceProtectedMemoryFeatures o){
            this(new VkPhysicalDeviceProtectedMemoryFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceProtectedMemoryFeatures.Array getVk(){
            return (VkPhysicalDeviceProtectedMemoryFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceProtectedMemoryFeatures get(int i){
            return new VulkanPhysicalDeviceProtectedMemoryFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceProtectedMemoryFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceProtectedMemoryFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceProtectedMemoryFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceProtectedMemoryFeatures.Pointer getVk(){
            return (VkPhysicalDeviceProtectedMemoryFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceProtectedMemoryFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProtectedMemoryFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceProtectedMemoryFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceProtectedMemoryFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceProtectedMemoryFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceProtectedMemoryFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceProtectedMemoryFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceProtectedMemoryFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
