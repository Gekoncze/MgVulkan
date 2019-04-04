package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceType.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceType extends VulkanEnum {
    public static final int OTHER = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER;
    public static final int INTEGRATED_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU;
    public static final int DISCRETE_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU;
    public static final int VIRTUAL_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU;
    public static final int CPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU;

    public VulkanPhysicalDeviceType(){
        super(new VkPhysicalDeviceType());
    }

    public VulkanPhysicalDeviceType(VkPhysicalDeviceType vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceType getVk(){
        return (VkPhysicalDeviceType) super.getVk();
    }

    public VulkanPhysicalDeviceType(int value){
        super(new VkPhysicalDeviceType(value));
    }

    @Override
    public String toString() {
        if(getValue() == OTHER) return "OTHER";
        if(getValue() == INTEGRATED_GPU) return "INTEGRATED_GPU";
        if(getValue() == DISCRETE_GPU) return "DISCRETE_GPU";
        if(getValue() == VIRTUAL_GPU) return "VIRTUAL_GPU";
        if(getValue() == CPU) return "CPU";
        return "UNKNOWN";
    }

    public static class Array extends VulkanPhysicalDeviceType implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceType> {
        public Array(VkPhysicalDeviceType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceType.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceType o){
            this(new VkPhysicalDeviceType.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceType.Array getVk(){
            return (VkPhysicalDeviceType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceType get(int i){
            return new VulkanPhysicalDeviceType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceType.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceType.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceType.Pointer getVk(){
            return (VkPhysicalDeviceType.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceType.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceType.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceType.Pointer.Array getVk(){
                return (VkPhysicalDeviceType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceType.Pointer get(int i){
                return new VulkanPhysicalDeviceType.Pointer(getVk().get(i));
            }
        }
    }
}
