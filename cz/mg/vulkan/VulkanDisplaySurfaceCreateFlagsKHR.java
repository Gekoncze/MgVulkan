package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplaySurfaceCreateFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanDisplaySurfaceCreateFlagsKHR extends VulkanFlags {
    public VulkanDisplaySurfaceCreateFlagsKHR(){
        super(new VkDisplaySurfaceCreateFlagsKHR());
    }

    public VulkanDisplaySurfaceCreateFlagsKHR(VkDisplaySurfaceCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplaySurfaceCreateFlagsKHR getVk(){
        return (VkDisplaySurfaceCreateFlagsKHR) super.getVk();
    }

    public VulkanDisplaySurfaceCreateFlagsKHR(int value){
        super(new VkDisplaySurfaceCreateFlagsKHR(value));
    }

    public static class Array extends VulkanDisplaySurfaceCreateFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplaySurfaceCreateFlagsKHR> {
        public Array(VkDisplaySurfaceCreateFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplaySurfaceCreateFlagsKHR.Array(count));
        }

        public Array(int count, VulkanDisplaySurfaceCreateFlagsKHR o){
            this(new VkDisplaySurfaceCreateFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplaySurfaceCreateFlagsKHR.Array getVk(){
            return (VkDisplaySurfaceCreateFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplaySurfaceCreateFlagsKHR get(int i){
            return new VulkanDisplaySurfaceCreateFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplaySurfaceCreateFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplaySurfaceCreateFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplaySurfaceCreateFlagsKHR.Pointer(value));
        }

        @Override
        public VkDisplaySurfaceCreateFlagsKHR.Pointer getVk(){
            return (VkDisplaySurfaceCreateFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplaySurfaceCreateFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplaySurfaceCreateFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplaySurfaceCreateFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplaySurfaceCreateFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplaySurfaceCreateFlagsKHR.Pointer.Array getVk(){
                return (VkDisplaySurfaceCreateFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplaySurfaceCreateFlagsKHR.Pointer get(int i){
                return new VulkanDisplaySurfaceCreateFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
