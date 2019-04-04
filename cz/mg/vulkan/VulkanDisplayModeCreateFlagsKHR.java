package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeCreateFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayModeCreateFlagsKHR extends VulkanFlags {
    public VulkanDisplayModeCreateFlagsKHR(){
        super(new VkDisplayModeCreateFlagsKHR());
    }

    public VulkanDisplayModeCreateFlagsKHR(VkDisplayModeCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeCreateFlagsKHR getVk(){
        return (VkDisplayModeCreateFlagsKHR) super.getVk();
    }

    public VulkanDisplayModeCreateFlagsKHR(int value){
        super(new VkDisplayModeCreateFlagsKHR(value));
    }

    public static class Array extends VulkanDisplayModeCreateFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeCreateFlagsKHR> {
        public Array(VkDisplayModeCreateFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayModeCreateFlagsKHR.Array(count));
        }

        public Array(int count, VulkanDisplayModeCreateFlagsKHR o){
            this(new VkDisplayModeCreateFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModeCreateFlagsKHR.Array getVk(){
            return (VkDisplayModeCreateFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModeCreateFlagsKHR get(int i){
            return new VulkanDisplayModeCreateFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayModeCreateFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayModeCreateFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayModeCreateFlagsKHR.Pointer(value));
        }

        @Override
        public VkDisplayModeCreateFlagsKHR.Pointer getVk(){
            return (VkDisplayModeCreateFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayModeCreateFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeCreateFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayModeCreateFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayModeCreateFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayModeCreateFlagsKHR.Pointer.Array getVk(){
                return (VkDisplayModeCreateFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayModeCreateFlagsKHR.Pointer get(int i){
                return new VulkanDisplayModeCreateFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
