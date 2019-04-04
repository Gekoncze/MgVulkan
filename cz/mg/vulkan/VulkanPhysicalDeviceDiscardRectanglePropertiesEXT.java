package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceDiscardRectanglePropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceDiscardRectanglePropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceDiscardRectanglePropertiesEXT(){
        super(new VkPhysicalDeviceDiscardRectanglePropertiesEXT());
    }

    public VulkanPhysicalDeviceDiscardRectanglePropertiesEXT(VkPhysicalDeviceDiscardRectanglePropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT getVk(){
        return (VkPhysicalDeviceDiscardRectanglePropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceDiscardRectanglePropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxDiscardRectangles) {
        super(new VkPhysicalDeviceDiscardRectanglePropertiesEXT(sType.getVk(), pNext.getVk(), maxDiscardRectangles.getVk()));
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

    public VulkanUInt32 getMaxDiscardRectangles() {
        return new VulkanUInt32(getVk().getMaxDiscardRectangles());
    }

    public void setMaxDiscardRectangles(VulkanUInt32 maxDiscardRectangles) {
        getVk().setMaxDiscardRectangles(maxDiscardRectangles.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceDiscardRectanglePropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDiscardRectanglePropertiesEXT> {
        public Array(VkPhysicalDeviceDiscardRectanglePropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceDiscardRectanglePropertiesEXT o){
            this(new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceDiscardRectanglePropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceDiscardRectanglePropertiesEXT get(int i){
            return new VulkanPhysicalDeviceDiscardRectanglePropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceDiscardRectanglePropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
