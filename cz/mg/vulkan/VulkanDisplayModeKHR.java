package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayModeKHR extends VulkanHandle {
    public VulkanDisplayModeKHR(){
        super(new VkDisplayModeKHR());
    }

    public VulkanDisplayModeKHR(VkDisplayModeKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeKHR getVk(){
        return (VkDisplayModeKHR) super.getVk();
    }

    public VulkanDisplayModeKHR(int value){
        super(new VkDisplayModeKHR(value));
    }

    public static class Array extends VulkanDisplayModeKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeKHR> {
        public Array(VkDisplayModeKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayModeKHR.Array(count));
        }

        public Array(int count, VulkanDisplayModeKHR o){
            this(new VkDisplayModeKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModeKHR.Array getVk(){
            return (VkDisplayModeKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModeKHR get(int i){
            return new VulkanDisplayModeKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayModeKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayModeKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayModeKHR.Pointer(value));
        }

        @Override
        public VkDisplayModeKHR.Pointer getVk(){
            return (VkDisplayModeKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayModeKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayModeKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayModeKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayModeKHR.Pointer.Array getVk(){
                return (VkDisplayModeKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayModeKHR.Pointer get(int i){
                return new VulkanDisplayModeKHR.Pointer(getVk().get(i));
            }
        }
    }
}
