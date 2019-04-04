package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceMaintenance3Properties.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceMaintenance3Properties extends VulkanObject {
    public VulkanPhysicalDeviceMaintenance3Properties(){
        super(new VkPhysicalDeviceMaintenance3Properties());
    }

    public VulkanPhysicalDeviceMaintenance3Properties(VkPhysicalDeviceMaintenance3Properties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMaintenance3Properties getVk(){
        return (VkPhysicalDeviceMaintenance3Properties) super.getVk();
    }

    public VulkanPhysicalDeviceMaintenance3Properties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxPerSetDescriptors, VulkanDeviceSize maxMemoryAllocationSize) {
        super(new VkPhysicalDeviceMaintenance3Properties(sType.getVk(), pNext.getVk(), maxPerSetDescriptors.getVk(), maxMemoryAllocationSize.getVk()));
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

    public VulkanUInt32 getMaxPerSetDescriptors() {
        return new VulkanUInt32(getVk().getMaxPerSetDescriptors());
    }

    public void setMaxPerSetDescriptors(VulkanUInt32 maxPerSetDescriptors) {
        getVk().setMaxPerSetDescriptors(maxPerSetDescriptors.getVk());
    }

    public VulkanDeviceSize getMaxMemoryAllocationSize() {
        return new VulkanDeviceSize(getVk().getMaxMemoryAllocationSize());
    }

    public void setMaxMemoryAllocationSize(VulkanDeviceSize maxMemoryAllocationSize) {
        getVk().setMaxMemoryAllocationSize(maxMemoryAllocationSize.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMaintenance3Properties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMaintenance3Properties> {
        public Array(VkPhysicalDeviceMaintenance3Properties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMaintenance3Properties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMaintenance3Properties o){
            this(new VkPhysicalDeviceMaintenance3Properties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMaintenance3Properties.Array getVk(){
            return (VkPhysicalDeviceMaintenance3Properties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMaintenance3Properties get(int i){
            return new VulkanPhysicalDeviceMaintenance3Properties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMaintenance3Properties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMaintenance3Properties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMaintenance3Properties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMaintenance3Properties.Pointer getVk(){
            return (VkPhysicalDeviceMaintenance3Properties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMaintenance3Properties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMaintenance3Properties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMaintenance3Properties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMaintenance3Properties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMaintenance3Properties.Pointer.Array getVk(){
                return (VkPhysicalDeviceMaintenance3Properties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMaintenance3Properties.Pointer get(int i){
                return new VulkanPhysicalDeviceMaintenance3Properties.Pointer(getVk().get(i));
            }
        }
    }
}
