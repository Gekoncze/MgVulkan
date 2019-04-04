package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceProtectedMemoryProperties.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceProtectedMemoryProperties extends VulkanObject {
    public VulkanPhysicalDeviceProtectedMemoryProperties(){
        super(new VkPhysicalDeviceProtectedMemoryProperties());
    }

    public VulkanPhysicalDeviceProtectedMemoryProperties(VkPhysicalDeviceProtectedMemoryProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceProtectedMemoryProperties getVk(){
        return (VkPhysicalDeviceProtectedMemoryProperties) super.getVk();
    }

    public VulkanPhysicalDeviceProtectedMemoryProperties(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 protectedNoFault) {
        super(new VkPhysicalDeviceProtectedMemoryProperties(sType.getVk(), pNext.getVk(), protectedNoFault.getVk()));
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

    public VulkanBool32 getProtectedNoFault() {
        return new VulkanBool32(getVk().getProtectedNoFault());
    }

    public void setProtectedNoFault(VulkanBool32 protectedNoFault) {
        getVk().setProtectedNoFault(protectedNoFault.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceProtectedMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProtectedMemoryProperties> {
        public Array(VkPhysicalDeviceProtectedMemoryProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceProtectedMemoryProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceProtectedMemoryProperties o){
            this(new VkPhysicalDeviceProtectedMemoryProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceProtectedMemoryProperties.Array getVk(){
            return (VkPhysicalDeviceProtectedMemoryProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceProtectedMemoryProperties get(int i){
            return new VulkanPhysicalDeviceProtectedMemoryProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceProtectedMemoryProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceProtectedMemoryProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceProtectedMemoryProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceProtectedMemoryProperties.Pointer getVk(){
            return (VkPhysicalDeviceProtectedMemoryProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceProtectedMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProtectedMemoryProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceProtectedMemoryProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceProtectedMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceProtectedMemoryProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceProtectedMemoryProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceProtectedMemoryProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceProtectedMemoryProperties.Pointer(getVk().get(i));
            }
        }
    }
}
