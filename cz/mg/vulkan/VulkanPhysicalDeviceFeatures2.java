package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceFeatures2.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceFeatures2 extends VulkanObject {
    public VulkanPhysicalDeviceFeatures2(){
        super(new VkPhysicalDeviceFeatures2());
    }

    public VulkanPhysicalDeviceFeatures2(VkPhysicalDeviceFeatures2 vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceFeatures2 getVk(){
        return (VkPhysicalDeviceFeatures2) super.getVk();
    }

    public VulkanPhysicalDeviceFeatures2(VulkanStructureType sType, VulkanObject pNext, VulkanPhysicalDeviceFeatures features) {
        super(new VkPhysicalDeviceFeatures2(sType.getVk(), pNext.getVk(), features.getVk()));
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

    public VulkanPhysicalDeviceFeatures getFeatures() {
        return new VulkanPhysicalDeviceFeatures(getVk().getFeatures());
    }

    public void setFeatures(VulkanPhysicalDeviceFeatures features) {
        getVk().setFeatures(features.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceFeatures2 implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceFeatures2> {
        public Array(VkPhysicalDeviceFeatures2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceFeatures2.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceFeatures2 o){
            this(new VkPhysicalDeviceFeatures2.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceFeatures2.Array getVk(){
            return (VkPhysicalDeviceFeatures2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceFeatures2 get(int i){
            return new VulkanPhysicalDeviceFeatures2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceFeatures2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceFeatures2.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceFeatures2.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceFeatures2.Pointer getVk(){
            return (VkPhysicalDeviceFeatures2.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceFeatures2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceFeatures2.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceFeatures2.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceFeatures2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceFeatures2.Pointer.Array getVk(){
                return (VkPhysicalDeviceFeatures2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceFeatures2.Pointer get(int i){
                return new VulkanPhysicalDeviceFeatures2.Pointer(getVk().get(i));
            }
        }
    }
}
