package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlanePropertiesKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayPlanePropertiesKHR extends VulkanObject {
    public VulkanDisplayPlanePropertiesKHR(){
        super(new VkDisplayPlanePropertiesKHR());
    }

    public VulkanDisplayPlanePropertiesKHR(VkDisplayPlanePropertiesKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlanePropertiesKHR getVk(){
        return (VkDisplayPlanePropertiesKHR) super.getVk();
    }

    public VulkanDisplayPlanePropertiesKHR(VulkanDisplayKHR currentDisplay, VulkanUInt32 currentStackIndex) {
        super(new VkDisplayPlanePropertiesKHR(currentDisplay.getVk(), currentStackIndex.getVk()));
    }

    public VulkanDisplayKHR getCurrentDisplay() {
        return new VulkanDisplayKHR(getVk().getCurrentDisplay());
    }

    public void setCurrentDisplay(VulkanDisplayKHR currentDisplay) {
        getVk().setCurrentDisplay(currentDisplay.getVk());
    }

    public VulkanUInt32 getCurrentStackIndex() {
        return new VulkanUInt32(getVk().getCurrentStackIndex());
    }

    public void setCurrentStackIndex(VulkanUInt32 currentStackIndex) {
        getVk().setCurrentStackIndex(currentStackIndex.getVk());
    }


    public static class Array extends VulkanDisplayPlanePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlanePropertiesKHR> {
        public Array(VkDisplayPlanePropertiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPlanePropertiesKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPlanePropertiesKHR o){
            this(new VkDisplayPlanePropertiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPlanePropertiesKHR.Array getVk(){
            return (VkDisplayPlanePropertiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPlanePropertiesKHR get(int i){
            return new VulkanDisplayPlanePropertiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPlanePropertiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPlanePropertiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPlanePropertiesKHR.Pointer(value));
        }

        @Override
        public VkDisplayPlanePropertiesKHR.Pointer getVk(){
            return (VkDisplayPlanePropertiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPlanePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlanePropertiesKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPlanePropertiesKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPlanePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPlanePropertiesKHR.Pointer.Array getVk(){
                return (VkDisplayPlanePropertiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPlanePropertiesKHR.Pointer get(int i){
                return new VulkanDisplayPlanePropertiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
